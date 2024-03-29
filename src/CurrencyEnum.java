public enum CurrencyEnum {
    USD("Доллар США"),
    EUR("Евро"),
    GBP("Фунт стерлингов"),
    CHF("Швейцарский франк"),
    PLN("Польская злота"),
    CZK("Чешская крона");

    private final String description;

    CurrencyEnum(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
