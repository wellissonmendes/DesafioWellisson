# language: pt
@SendQuote
Funcionalidade: Preencher aba Send Quote
  Como usuário
  Eu devo preencher todos os campos do formulário
  Para pressionar o botão Send


  Cenario: Deve preencher a aba Send Quote
    Dado Acessei site sampleApp
    E preencher o campo Make informando "Audi"
    E preencher o campo Model informando "Scooter"
    E preencher o campo Cylinder Capacity informando "200"
    E preencher o campo Engine Performance informando "200"
    E preencher o campo Date of Manufacture informando "09/01/2021"
    E preencher o campo Number of Seats informando "1"
    E preencher o campo Right Hand Drive informando "No"
    E preencher o campo Number of Seats Motor Cycle informando "1"
    E preencher o campo Fuel Type informando "Diesel"
    E preencher o campo Payload informando "200"
    E preencher o campo Total Weight informando "200"
    E preencher o campo List Price informando "2000"
    E preencher o campo License Plate Number informando "200"
    E preencher o campo Annual Mileage informando "200"
    E acionar botão next
    E serei redirecionado para aba "Enter Insurant Data"

    E preencher o campo First Name "Joao"
    E preencher o campo Last Name "Silva"
    E preencher o campo Date of Birth "03/03/1994"
    E preencher o campo Gender "Male"
    E preencher o campo Street Address "Endereco"
    E preencher o campo Country "Austria"
    E preencher o campo Zip Code "70222000"
    E preencher o campo City "Joao"
    E preencher o campo Occupation "Farmer"
    E preencher o campo Hobbies "Speeding"
    E preencher o campo Website "http://wwww.google.com"
    E preencher o campo Picture "C:\Users\Wellisson\Desktop\teste.txt"
    E acionar botão nextProductData
    E serei redirecionado para aba "Enter Product Data"

    E preencher o campo Start Date "11/18/2021"
    E preencher o campo Insurance Sum "3000000"
    E preencher o campo Merit Rating "Super Bonus"
    E preencher o campo Damage Insurance "No Coverage"
    E preencher o campo Optional Products "Euro Protection"
    E preencher o campo Courtesy Car "No"
    E acionar botão nextselectpriceoption
    E serei redirecionado para aba "Select Price Option"

    E seleciono a modalidade do preço "Ultimate"
    E seleciono o botão nextsendquote
    E serei redirecionado para aba "Send Quote"

    E preencher o campo e-mail "wellisson.mendes@gmail.com"
    E preencher o campo phone "61999565250"
    E preencher o campo username "joaozinho"
    E preencher o campo password "Teste@123"
    E preencher o campo confirm password "Teste@123"
    E preencher o campo comentários "Apenas a realização de um teste de preenchimento"
    Quando aciono o botão sendemail
    Entao será a apresentado a mensagem "Sending e-mail success!"


