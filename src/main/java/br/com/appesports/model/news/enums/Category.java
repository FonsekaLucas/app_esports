package br.com.appesports.model.news.enums;

public enum Category {
    LEAGUE_OF_LEGENDS(1, "League of Legends"),
    CS_GO(2, "CS GO"),
    OVERWATCH(3, "Overwatch"),
    FIFA(4, "FIFA"),
    PUBG(5, "PUBG"),
    FORTNITE(6, "Fortnite"),
    ARENA_OF_VALOR(7, "Arena of Valor"),
    CLASH_ROYALE(8, "Clash Royale"),
    R6_SIEGE(9, "Rainbow 6 Siege"),
    JOGOS_DE_LUTA(10, "Jogos de Luta"),
    OUTROS(11, "Outros");

    private Integer idCategory;

    private String categoryName;

    Category(Integer idCategory, String categoryName) {
        this.idCategory = idCategory;
        this.categoryName = categoryName;
    }

    public Integer getIdCategory() {
        return idCategory;
    }

    public String getCategoryName() {
        return categoryName;
    }
}