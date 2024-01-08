const readline = require('readline');

const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

rl.question('Digite os valores de A, B e C (a,b,c): ', (numeros) => {
    let valores = numeros.split(",");

    let a, b, c;

    if(valores.length === 3){
        a = parseFloat(valores[0].trim());
        b = parseFloat(valores[1].trim());
        c = parseFloat(valores[2].trim());

        if(a === 0){
            //Quando A e B forem igual a 0
            if(b === 0){
                console.log("A e B não podem ser 0.");
            } else {
                let x1 = -c/b;
                console.log(`Se A = 0, então a equação é de 1° grau. O resultado de x é ${x1}`);
            }
        } else if(b === 0){
            let x1 = Math.sqrt(Math.abs(c)/Math.abs(a));
            console.log(`A equação possui uma raiz real: X = ${x1} `)
        }
        else {
            let delta = (Math.pow(b,2) - 4 * a * c);

            if(delta < 0){
                console.log("A equação não possui raízes reais.");
            } else if(delta === 0){
                let x1 = -b/(2 * a);
                console.log(`A equação possui raiz real: x = ${x1}`);
            } else {
                let x1 = (-b + Math.sqrt(delta)) / (2 * a);
                let x2 = (-b - Math.sqrt(delta)) / (2 * a);
                console.log(`A equação possui duas raízes reais: x1 = ${x1} e x2 = ${x2}`)
            }

        }
    } else {
        console.log("Entrada inválida. Você deve fornecer exatamente três valores separados por vírgula.");
    }

    rl.close();
})
