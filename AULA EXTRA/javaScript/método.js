//a exceção é levada para catch e automaticamentente interrompe o try
var num;
try{
    num=10/0;
    document.write("CFB Cursos");
}catch(erro){
    document.write("ERRO" + num);
    console.log("Mensagem de erro:" + erro.message);
}

