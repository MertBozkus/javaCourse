public class Main {

    public static void main(String[] args) {

//        BaseLogger[] baseLoggers = new BaseLogger[] {
//                new FileLogger(),
//                new EmailLogger(),
//                new DatabaseLogger(),
//                new ConsoleLogger()
//        };
//
//        for(BaseLogger baseLogger:baseLoggers) {
//            baseLogger.Log("Log Mesajı");
//        }

        CustomerManager customerManager = new CustomerManager(new FileLogger());
        customerManager.add();

    }
}
