void main() {
    String nome = IO.readln("Digite seu nome: ");
    char genero = IO.readln("Informe seu gênero (M: masculino, F: feminino, N: prefiro não informar): ").charAt(0);
    String alturaStr = IO.readln("Informe sua altura: ");
    String pesoStr = IO.readln("Informe seu peso em quilos: ");
    
    double altura = Double.parseDouble(alturaStr);
    double peso = Double.parseDouble(pesoStr);

    double IMC = peso / (altura * altura);

    String classificacaoIMC = "=";
    
    switch (genero) {
        case 'M','m':
            classificacaoIMC = classificarHomem(IMC);
            break;
        case 'F','f','N','n':
            classificacaoIMC = classificarMulher(IMC);
            break;
        default:
            classificacaoIMC = classificarMulher(IMC);
            break;
    }

    IO.println("Nome: " + nome);
    IO.println("Gênero: " + genero);
    IO.println("IMC: " + IMC);
    IO.println("Classificação: " + classificacaoIMC);
}
    String classificarHomem(double IMC) {
        if (IMC >= 40)
            return "Obesidade Mórbida";
        else if (IMC >= 30)
            return "Obesidade Moderada";
        else if (IMC >= 25)
            return "Obesidade Leve";
        else if (IMC >= 20)
            return "Normal";
        else if (IMC < 20)
            return "Abaixo do Normal";
        else
            return "Desconhecido";
    };
    
    String classificarMulher(double IMC){
        if (IMC >= 39)
            return "Obesidade Mórbida";
        else if (IMC >= 29)
            return "Obesidade Moderada";
        else if (IMC >= 24)
            return "Obesidade Leve";
        else if (IMC >= 19)
            return "Normal";
        else if (IMC < 19)
            return "Abaixo do Normal";
        else
            return "Desconhecido";
    };
