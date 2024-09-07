package ru.netology.banklogin.page;




public class DashboardPage {
    private final SelenideElement heading = $("[data-test-id=dashboard]");

    public DashboardPage() {
        heading.shouldHave(text("Личный кабинет")).shouldBe(visible);
    }
}