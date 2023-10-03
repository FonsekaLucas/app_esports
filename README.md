# Projeto app_esports

Projeto piloto de um aplicativo de notícias de eSports.

## Categoria de uma nova postagem

- Será armazenada na base de dados, possibilitando a inclusão de **N** categorias;
- Deverá ser previamente exibida no cadastro da nova postagem, em uma caixa de seleção:
	- Incluir uma chamada GET para recuperar as categorias [getCategories()];
- Caso a categoria não esteja cadastrada, será possível cadastrar uma nova categoria distinta:
	- Habilitar uma caixa de texto para que seja cadastrada uma nova categoria;
	- Realizar validação para caso haja uma nova categoria, cadastrar na base de dados com uma chamada PUT [saveNewCategory(Category)];
