## Proyecto Semestral - Programación II.
Tema 4: Pizarra para hacer clases web.
Eduardo Parra __ Matias Escobar __ Tomas Rodriguez
# Enunciado general del proyecto: 
Se debe crear una pizarra múltiple que permita dibujar trazos, rectángulos, y conectores UML con mouseDrag.
La pizarra debe modos de edición tales como borrar, y crear las diferentes formas de UML.
Para eliminar se busca el elemento que contenga los pixeles encerrados por un rectángulo fantasma que queda entre mousePress y mouseRelease.
La pizarra múltiple consiste en tener en el panel central una de ellas a la vez, pudiendo cambiar de una a otra sin perder lo editado.
Se debe poder grabar en archivo la pizarra múltiple y cargarla de este. se debe poder borrar la pizarra completa.
La pizarra múltiple se debe grabar en el archivo automáticamente al cambiar de una pizarra a otra. Se debe poder elegir el color de las líneas mediante botones GUI.


(SOLUCIONADO)ERROR FATAL: cualquier evento que provoque una actualizacion Eliminara
todos los trazos dibujados en el Lienzo.

PROBLEMA DE O.O.P: intente investigar como controlar el paint del JPANEL principal desde clases externas pero al final no
pude encontrar forma de hacer eso, lo que me llevara a saturar el paint de codigo para poder controlarlo desde fuera.

FEATURE: Se agrego un metodo para guardar los trazos en arraylist para luego guardarlos en serializable

HEAD_PAIN: Las flechas de los UML tienen que girar (las hare 4 posiciones posiblemente. )

HEAD_PAIN: si se hacen commits al readme via github luego tendre que hacer git mergue.

DATO IMPORTANTE: para poder aceptar en la consola de merge hay que pulsar 2 veces !
 Asi :  !  ,  !  y podremos escribir comandos (no borrar el !)

extraño error: por alguna razon no se que hice las flechas dejaron de funcionar. (lo restitui con controlZ)

PROBLEMA TIME WASTER: (5 hrs perdidas) resulta que Keylistener se desactiva si presionas un boton
(LA SOLUCION: agregar el key listener a un boton cualquiera, no al jpanel. nose porque pero funciona.


