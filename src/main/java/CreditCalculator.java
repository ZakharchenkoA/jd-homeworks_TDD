public class CreditCalculator {

    public static void main(String[] args) {

        int sum = 3_000_000;
        double rate = 13.9;
        int loanPeriod = 60;

        System.out.println("Ежемесячный платеж: " + sumPerMonth(sum, rate, loanPeriod) + "\n"
                + "Сумма возврата в банк: " + fullSumReturn(sum, rate, loanPeriod) + "\n"
                + "Переплата за весь период: " + overPaySum(sum, rate, loanPeriod));
    }

    public static int sumPerMonth(int sum, double rate, int loanPeriod) {
        double ratePerMonth = (rate / 12) / 100;
        double annuityRate = ratePerMonth * (Math.pow(1 + ratePerMonth, loanPeriod)) /
                ((Math.pow(1 + ratePerMonth, loanPeriod)) - 1);
        return (int) (sum * annuityRate);
    }

    public static int fullSumReturn(int sum, double rate, int loanPeriod) {
        double ratePerMonth = (rate / 12) / 100;
        double annuityRate = ratePerMonth * (Math.pow(1 + ratePerMonth, loanPeriod))
                / ((Math.pow(1 + ratePerMonth, loanPeriod)) - 1);
        return (int) ((sum * annuityRate) * loanPeriod);
    }

    public static int overPaySum(int sum, double rate, int loanPeriod) {
        double ratePerMonth = (rate / 12) / 100;
        double annuityRate = ratePerMonth * (Math.pow(1 + ratePerMonth, loanPeriod))
                / ((Math.pow(1 + ratePerMonth, loanPeriod)) - 1);
        return (int) ((sum * annuityRate) * loanPeriod - sum);
    }
}
