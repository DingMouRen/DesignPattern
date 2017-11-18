package design2_构建者模式;

/**
 * Created by dingmouren on 2017/8/16.
 * email:naildingmouren@gmail.com
 * 保险合同对象
 */

public class InsuranceContract {
    private String contractid;
    private String personName;
    private String companyName;
    private long beginDate;
    private long endDate;
    private String otherData;

    /**
     * 只让Builder能够创建对象
     *
     * @param builder
     */
    private InsuranceContract(ConcreteBuilder builder) {
        this.contractid = builder.getContractid();
        this.personName = builder.getPersonName();
        this.companyName = builder.getCompanyName();
        this.beginDate = builder.getBeginDate();
        this.endDate = builder.getEndDate();
        this.otherData = builder.getOtherData();
    }

    /**
     * 保险合同对象的其他操作
     */
    public void showInfo() {
        System.out.println("保险合同的详细信息：......");
    }

    /**
     * Created by dingmouren on 2017/8/16.
     * email:naildingmouren@gmail.com
     * 构建保险合同对象的构建器
     */
    public static class ConcreteBuilder {
        private String contractid;
        private String personName;
        private String companyName;
        private long beginDate;
        private long endDate;
        private String otherData;

        /**
         * 构造函数总传入必须要有的参数
         *
         * @param contractid 保险合同编号
         * @param beginDate  保险合同开始日期
         * @param endDate    保险失效日期
         */
        public ConcreteBuilder(String contractid, long beginDate, long endDate) {
            this.contractid = contractid;
            this.beginDate = beginDate;
            this.endDate = endDate;
        }



        //下面是选填数据的设置，都返回构建器对象
        public ConcreteBuilder setPersonName(String personName) {
            this.personName = personName;
            return this;
        }

        public ConcreteBuilder setCompanyName(String companyName) {
            this.companyName = companyName;
            return this;
        }

        public ConcreteBuilder setOtherData(String otherData) {
            this.otherData = otherData;
            return this;
        }

        /**
         * 构建真正的对象并返回
         *
         * @return 保险合同对象
         */
        public InsuranceContract build() {

            //进行整体数据校验
            if (contractid == null || contractid.trim().length() == 0) throw new IllegalArgumentException("合同编号不能为空");

            //这是设计到两个数据的约束关系，在build方法中校验比较合适
            boolean signPerson = personName != null && personName.trim().length() > 0;
            boolean signCompany = companyName != null && companyName.trim().length() > 0;

            if (signCompany && signPerson) throw new IllegalArgumentException("一份合同不能同时与人和公司签订");
            if (signCompany == false && signPerson == false) throw new IllegalArgumentException("一份合同不能没有签订对象");
            if (beginDate <= 0) throw new IllegalArgumentException("合同必须有保险开始生效日期");
            if (endDate <= 0) throw new IllegalArgumentException("合同必须有保险失效日期");
            if (endDate <= beginDate) throw new IllegalArgumentException("保险失效日期必须大于保险的生效日期");

            return new InsuranceContract(this);
        }

        //下面是提供getter方法供外部访问，注意没有setter方法哦


        public String getContractid() {
            return contractid;
        }

        public String getPersonName() {
            return personName;
        }

        public String getCompanyName() {
            return companyName;
        }

        public long getBeginDate() {
            return beginDate;
        }

        public long getEndDate() {
            return endDate;
        }

        public String getOtherData() {
            return otherData;
        }
    }
}
