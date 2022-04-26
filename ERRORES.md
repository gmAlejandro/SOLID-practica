# Principios SOLID
## Ejercicio de práctica

### Errores

1. La clase File incumple el principio de Responsabilidad Única con los métodos de conversión de ficheros, así que los he extraído a una clase llamada Converter como métodos estáticos

2. En la clase FileManager se incumple el principio Abierto Cerrado así que he quitado uno de los métodos 'calculateSize'.

3. La interfaz FileSystemItem era demasiado grande, así que he añadido dos interfaces más para que cada una solo implemente los metodos necesarios para cada tipo de item (File y Directory). Al haber creado estas interfaces también cumplimos el principio de Sustitución de Liskov.


