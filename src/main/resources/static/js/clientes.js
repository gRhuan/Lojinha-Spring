// Seleciona os botões e o diálogo
const novoClienteDialog = document.getElementById("novoClienteDialog");
const openDialogButton = document.getElementById("openDialogButton");
const closeDialogButton = document.getElementById("closeDialogButton");



// Abre o diálogo ao clicar no botão
openDialogButton.addEventListener("click", () => {
    novoClienteDialog.showModal();
});

// Fecha o diálogo ao clicar no botão de cancelar
closeDialogButton.addEventListener("click", () => {
    novoClienteDialog.close();
});
