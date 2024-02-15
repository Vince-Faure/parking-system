1. Créez une interface **`Vehicule`** avec les méthodes suivantes :
    - **`void demarrer()`**
    - **`void arreter()`**
    - **`void klaxonner()`**
2. Créez plusieurs classes qui implémentent l'interface **`Vehicule`**, comme **`Voiture`**, **`Camion`**, **`Moto`**, etc. Chaque classe devrait implémenter les méthodes de l'interface de manière appropriée. Par exemple, **`klaxonner()`** pourrait retourner "Honk Honk" pour une **`Voiture`** et "Beep Beep" pour une **`Moto`**.
3. Créez une classe **`Garage`** qui contient quatre attributs **`Vehicule`** : **`place1`**, **`place2`**, **`place3`** et **`place4`**. Cette classe devrait avoir les méthodes suivantes :
    - **`void garerVehicule1(Vehicule vehicule)`**
    - **`void garerVehicule2(Vehicule vehicule)`**
    - **`void garerVehicule3(Vehicule vehicule)`**
    - **`void garerVehicule4(Vehicule vehicule)`**
    - **`void demarrerTousLesVehicules()`**
    - **`void arreterTousLesVehicules()`**
    - **`void klaxonnerTousLesVehicules()`**
    
    > En temps normal, nous utiliserions les `**Collections**` pour ce type de tâche. Cependant, comme nous n'avons pas encore abordé ce sujet, nous allons procéder différemment.
    > 
4. Enfin, dans votre méthode **`main()`**, créez plusieurs véhicules et un garage, garez les véhicules dans le garage et utilisez les méthodes **`demarrerTousLesVehicules()`**, **`arreterTousLesVehicules()`** et **`klaxonnerTousLesVehicules()`**.
