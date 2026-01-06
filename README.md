Aplicación con salida por pantalla que simula el famoso juego de mesa Hundir la Flota

Problemas:

account.java

- Variables private para evitar que modifiquen desde el main: Nombre, cantidad de partidas, porcentaje de partidas.

- Crear el archivo csv

- Añadir el nombre del jugador / cantidad de partidas / y porcentaje de victorias

- Comprobar si existe el jugador si existe aumentar cantidad de partidas y recalcular el porcentaje de victorias

- No permitir que en el archivo se creen dos veces el mismo nombre de jugador

barcos.java

- Variables private: Cada uno de los barcos (evitamos que desde el main modifiquen la vida de los barcos y por ejemplo digan que todos los barcos tienen 1 de vida)

- Debería crear los objetos barco con sus respectivos tamaños y acoplarlos a un array bidimensional
  un array bidimensional es un array de arrays por lo tanto los barcos tendrian que ser arrays bidimensionales con sus respectivos tamaños

- Darle a la maquina los parametros necesarios para que te coloque los barcos en al rray

- Que la máquina coloque sus propios barcos de manera aleatoria o Pseudoaleatoria si es necesario

tablero.java

- Variables private : tablero

- arrays bidimensionales de 8 x 8 para los tableros

- me gustaria crear una interfaz más visual que te enseñe tu tablero y si la maquina a acertado en tus barcos o no y un mapa de tus disparos para ver si has acertado tú
