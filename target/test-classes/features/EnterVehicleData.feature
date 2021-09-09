# language: pt
@EnterVehicleData
Funcionalidade: Preencher formulário Enter Vehicle Data
  Como usuário
  Eu devo preencher todos os campos do formulário
  Para pressionar o botão next


  Cenario: Deve preencher o formulário aba Enter Vehicle Data
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
    Quando acionar botão next
    Entao serei redirecionado para aba "Enter Insurant Data"









