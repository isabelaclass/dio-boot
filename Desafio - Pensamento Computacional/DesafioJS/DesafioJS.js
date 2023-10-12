const valorSalario = parseFloat(gets());
const valorBeneficio = parseFloat(gets());

const valorImposto = calcularImposto(valorSalario);
const saida = valorSalario - valorImposto + valorBeneficio;
print(saida.toFixed(2));

function calcularImposto(salario){
    if(salario >= 0 && salario <= 1100){
        aliquota = 0.05;
    } else if (salario >= 1100.01 && salario <= 2500.00) {
        aliquota = 0.10 * salario;
    } else {
        aliquota = 0.15;
    }
    return aliquota * salario;
}