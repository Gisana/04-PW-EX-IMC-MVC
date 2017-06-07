<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Exemplo JSP</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
  </head>
  <body>
    <div class="col-md-12">
        <div class="modal-dialog" style="margin-bottom:0">
            <div class="modal-content">
                <div class="panel-heading">
                    <h3 class="panel-title">Calculadora IMC</h3>
                </div>
                <div class="panel-body">
                <form name="formulario">
                    <fieldset>
                        <div class="form-group">
                                <input class="form-control" placeholder="Peso (kg)" name="peso" type="peso" autofocus="">
                            </div>
                            <div class="form-group">
                                <input class="form-control" placeholder="Altura (m)" name="altura" type="text" autofocus="">
                            </div>
                            <div class="form-group">
                                <label for="exampleSelect1">Sexo</label>
                                <select class="form-control" id="sexo">
                                    <option>Feminino</option>
                                        <option>Masculino</option>
                                </select>
                            </div>
                        <button class="btn btn-sm btn-success">Calcular</button>
                    </fieldset>
                </form>
            </div>
        </div>
        <div class="alert alert-success" role="alert" style="margin-top:45px">${resultado}</div>
    </div>
  </body>
</html>