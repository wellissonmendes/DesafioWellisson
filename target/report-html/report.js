$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/SendQuote.feature");
formatter.feature({
  "name": "Preencher aba Send Quote",
  "description": "  Como usuário\n  Eu devo preencher todos os campos do formulário\n  Para pressionar o botão Send",
  "keyword": "Funcionalidade",
  "tags": [
    {
      "name": "@SendQuote"
    }
  ]
});
formatter.scenario({
  "name": "Deve preencher a aba Send Quote",
  "description": "",
  "keyword": "Cenario",
  "tags": [
    {
      "name": "@SendQuote"
    }
  ]
});
formatter.step({
  "name": "Acessei site sampleApp",
  "keyword": "Dado "
});
formatter.match({
  "location": "EnterVehicleDataSteps.acessei_site_sampleApp()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "preencher o campo Make informando \"Audi\"",
  "keyword": "E "
});
formatter.match({
  "location": "EnterVehicleDataSteps.preencher_o_campo_Make_informando(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "preencher o campo Model informando \"Scooter\"",
  "keyword": "E "
});
formatter.match({
  "location": "EnterVehicleDataSteps.preencher_o_campo_Model_informando(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "preencher o campo Cylinder Capacity informando \"200\"",
  "keyword": "E "
});
formatter.match({
  "location": "EnterVehicleDataSteps.preencher_o_campo_Cylinder_Capacity_informando(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "preencher o campo Engine Performance informando \"200\"",
  "keyword": "E "
});
formatter.match({
  "location": "EnterVehicleDataSteps.preencher_o_campo_Engine_Performance_informando(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "preencher o campo Date of Manufacture informando \"09/01/2021\"",
  "keyword": "E "
});
formatter.match({
  "location": "EnterVehicleDataSteps.preencher_o_campo_Date_of_Manufacture_informando(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "preencher o campo Number of Seats informando \"1\"",
  "keyword": "E "
});
formatter.match({
  "location": "EnterVehicleDataSteps.preencher_o_campo_Number_of_Seats_informando(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "preencher o campo Right Hand Drive informando \"No\"",
  "keyword": "E "
});
formatter.match({
  "location": "EnterVehicleDataSteps.preencher_o_campo_Right_Hand_Drive_informando(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "preencher o campo Number of Seats Motor Cycle informando \"1\"",
  "keyword": "E "
});
formatter.match({
  "location": "EnterVehicleDataSteps.preencher_o_campo_Number_of_Seats_Motor_Cycle_informando(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "preencher o campo Fuel Type informando \"Diesel\"",
  "keyword": "E "
});
formatter.match({
  "location": "EnterVehicleDataSteps.preencher_o_campo_Fuel_Type_informando(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "preencher o campo Payload informando \"200\"",
  "keyword": "E "
});
formatter.match({
  "location": "EnterVehicleDataSteps.preencher_o_campo_Payload_informando(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "preencher o campo Total Weight informando \"200\"",
  "keyword": "E "
});
formatter.match({
  "location": "EnterVehicleDataSteps.preencher_o_campo_Total_Weight_informando(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "preencher o campo List Price informando \"2000\"",
  "keyword": "E "
});
formatter.match({
  "location": "EnterVehicleDataSteps.preencher_o_campo_List_Price_informando(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "preencher o campo License Plate Number informando \"200\"",
  "keyword": "E "
});
formatter.match({
  "location": "EnterVehicleDataSteps.preencher_o_campo_License_Plate_Number_informando(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "preencher o campo Annual Mileage informando \"200\"",
  "keyword": "E "
});
formatter.match({
  "location": "EnterVehicleDataSteps.preencher_o_campo_Annual_Mileage_informando(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "acionar botão next",
  "keyword": "E "
});
formatter.match({
  "location": "EnterVehicleDataSteps.acionar_botão_next()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "serei redirecionado para aba \"Enter Insurant Data\"",
  "keyword": "E "
});
formatter.match({
  "location": "EnterVehicleDataSteps.serei_redirecionado_para_aba(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "preencher o campo First Name \"Joao\"",
  "keyword": "E "
});
formatter.match({
  "location": "EnterInsurantDataSteps.preencher_o_campo_First_Name(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "preencher o campo Last Name \"Silva\"",
  "keyword": "E "
});
formatter.match({
  "location": "EnterInsurantDataSteps.preencher_o_campo_Last_Name(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "preencher o campo Date of Birth \"03/03/1994\"",
  "keyword": "E "
});
formatter.match({
  "location": "EnterInsurantDataSteps.preencher_o_campo_Date_of_Birth(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "preencher o campo Gender \"Male\"",
  "keyword": "E "
});
formatter.match({
  "location": "EnterInsurantDataSteps.preencher_o_campo_Gender(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "preencher o campo Street Address \"Endereco\"",
  "keyword": "E "
});
formatter.match({
  "location": "EnterInsurantDataSteps.preencher_o_campo_Street_Address(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "preencher o campo Country \"Austria\"",
  "keyword": "E "
});
formatter.match({
  "location": "EnterInsurantDataSteps.preencher_o_campo_Country(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "preencher o campo Zip Code \"70222000\"",
  "keyword": "E "
});
formatter.match({
  "location": "EnterInsurantDataSteps.preencher_o_campo_Zip_Code(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "preencher o campo City \"Joao\"",
  "keyword": "E "
});
formatter.match({
  "location": "EnterInsurantDataSteps.preencher_o_campo_City(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "preencher o campo Occupation \"Farmer\"",
  "keyword": "E "
});
formatter.match({
  "location": "EnterInsurantDataSteps.preencher_o_campo_Occupation(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "preencher o campo Hobbies \"Speeding\"",
  "keyword": "E "
});
formatter.match({
  "location": "EnterInsurantDataSteps.preencher_o_campo_Hobbies(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "preencher o campo Website \"http://wwww.google.com\"",
  "keyword": "E "
});
formatter.match({
  "location": "EnterInsurantDataSteps.preencher_o_campo_Website(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "preencher o campo Picture \"C:\\Users\\Wellisson\\Desktop\\teste.txt\"",
  "keyword": "E "
});
formatter.match({
  "location": "EnterInsurantDataSteps.preencher_o_campo_Picture(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "acionar botão nextProductData",
  "keyword": "E "
});
formatter.match({
  "location": "EnterInsurantDataSteps.acionar_botão_nextProductData()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "serei redirecionado para aba \"Enter Product Data\"",
  "keyword": "E "
});
formatter.match({
  "location": "EnterVehicleDataSteps.serei_redirecionado_para_aba(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "preencher o campo Start Date \"11/18/2021\"",
  "keyword": "E "
});
formatter.match({
  "location": "EnterProductDataSteps.preencher_o_campo_Start_Date(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "preencher o campo Insurance Sum \"3000000\"",
  "keyword": "E "
});
formatter.match({
  "location": "EnterProductDataSteps.preencher_o_campo_Insurance_Sum(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "preencher o campo Merit Rating \"Super Bonus\"",
  "keyword": "E "
});
formatter.match({
  "location": "EnterProductDataSteps.preencher_o_campo_Merit_Rating(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "preencher o campo Damage Insurance \"No Coverage\"",
  "keyword": "E "
});
formatter.match({
  "location": "EnterProductDataSteps.preencher_o_campo_Damage_Insurance(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "preencher o campo Optional Products \"Euro Protection\"",
  "keyword": "E "
});
formatter.match({
  "location": "EnterProductDataSteps.preencher_o_campo_Optional_Products(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "preencher o campo Courtesy Car \"No\"",
  "keyword": "E "
});
formatter.match({
  "location": "EnterProductDataSteps.preencher_o_campo_Courtesy_Car(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "acionar botão nextselectpriceoption",
  "keyword": "E "
});
formatter.match({
  "location": "EnterProductDataSteps.acionar_botão_nextselectpriceoption()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "serei redirecionado para aba \"Select Price Option\"",
  "keyword": "E "
});
formatter.match({
  "location": "EnterVehicleDataSteps.serei_redirecionado_para_aba(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "seleciono a modalidade do preço \"Ultimate\"",
  "keyword": "E "
});
formatter.match({
  "location": "SelectPriceOptionSteps.seleciono_a_modalidade_do_preço(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "seleciono o botão nextsendquote",
  "keyword": "E "
});
formatter.match({
  "location": "SelectPriceOptionSteps.seleciono_o_botão_nextsendquote()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "serei redirecionado para aba \"Send Quote\"",
  "keyword": "E "
});
formatter.match({
  "location": "EnterVehicleDataSteps.serei_redirecionado_para_aba(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "preencher o campo e-mail \"wellisson.mendes@gmail.com\"",
  "keyword": "E "
});
formatter.match({
  "location": "SendQuoteSteps.preencher_o_campo_e_mail(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "preencher o campo phone \"61999565250\"",
  "keyword": "E "
});
formatter.match({
  "location": "SendQuoteSteps.preencher_o_campo_phone(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "preencher o campo username \"joaozinho\"",
  "keyword": "E "
});
formatter.match({
  "location": "SendQuoteSteps.preencher_o_campo_username(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "preencher o campo password \"Teste@123\"",
  "keyword": "E "
});
formatter.match({
  "location": "SendQuoteSteps.preencher_o_campo_password(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "preencher o campo confirm password \"Teste@123\"",
  "keyword": "E "
});
formatter.match({
  "location": "SendQuoteSteps.preencher_o_campo_confirm_password(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "preencher o campo comentários \"Apenas a realização de um teste de preenchimento\"",
  "keyword": "E "
});
formatter.match({
  "location": "SendQuoteSteps.preencher_o_campo_comentários(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "aciono o botão sendemail",
  "keyword": "Quando "
});
formatter.match({
  "location": "SendQuoteSteps.aciono_o_botão_sendemail()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "será a apresentado a mensagem \"Sending e-mail success!\"",
  "keyword": "Entao "
});
formatter.match({
  "location": "SendQuoteSteps.será_a_apresentado_a_mensagem(String)"
});
formatter.result({
  "status": "passed"
});
});