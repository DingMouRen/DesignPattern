package design2_构建者模式;

public class Test {
    public static void main(String[] args) {
        InsuranceContract.ConcreteBuilder builder = new InsuranceContract.ConcreteBuilder("001",1100L,1199L);
        InsuranceContract contract = builder.setCompanyName("太平保险")
                .setPersonName("小明")
                .setOtherData("其他信息")
                .build();
        contract.showInfo();//显示保险合同信息
    }
}
