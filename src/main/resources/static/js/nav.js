document.addEventListener('DOMContentLoaded', function () {
    // Definir o HTML da navbar
    const navbarHTML = `
        <nav class="navbar navbar-expand-lg custom-navbar">
            <a class="navbar-brand" href="#">Minha Lojinha</a>
            <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav"
                aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse" id="navbarNav">
                <ul class="navbar-nav">
                    <li class="nav-item">
                        <a class="nav-link" href="#">Home</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="#">Funcionários</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="#">Sobre</a>
                    </li>
                </ul>
            </div>
        </nav>
    `;

    // Injetar a navbar no local desejado (ex: dentro de um div com id 'navbarContainer')
    document.getElementById('navbarContainer').innerHTML = navbarHTML;
});
