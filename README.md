# Jaxp JDK11

Fonte template redazione documento:  https://www.makeareadme.com/.


# Descrizione

Il seguente progetto è utilizzato come **dipendenza** interna come da guida : https://access.redhat.com/solutions/4652491. Nello specifico, è stato riadattato il progetto maven fornito da RedHat adeguandolo opportunamente alle necessità applicative al fine di essere utilizzato come "wrapper" di factory legati al package java.xml (xalan / xerces internal alla JDK 11).

# Installazione

Come già specificato nel paragrafo precedente [Descrizione](# Descrizione) si tratta di un progetto di tipo "libreria", quindi un modulo applicativo utilizzato attraverso la definzione della dipendenza Maven secondo lo standard previsto (https://maven.apache.org/): 

```xml
<dependency>
    <groupId>jaxp.jdk</groupId>
    <artifactId>jaxp-jdk11</artifactId>
    <version>$VERSIONE</version>
    <scope>runtime</scope>
</dependency>
```

# Utilizzo

Il modulo contiene al suo interno una serie di classi che fungono da "wrapper", ossia dei veri e propri "ponti" attraverso i quali si permette all'application server di accedere ai moduli standard della JDK11 legati alla gestione di XML / DOM dato che il modulo nome come "jigsaw" non è direttamente accessibile (vedere apposita guida https://access.redhat.com/solutions/4652491).

# Supporto

Mantainer del progetto è [Engineering Ingegneria Informatica S.p.A.](https://www.eng.it/).

# Contributi

Se interessati a crontribuire alla crescita del progetto potete scrivere all'indirizzo email <a href="mailto:areasviluppoparer@regione.emilia-romagna.it">areasviluppoparer@regione.emilia-romagna.it</a>.

# Credits

Progetto di proprietà di [Regione Emilia-Romagna](https://www.regione.emilia-romagna.it/) sviluppato a cura di [Engineering Ingegneria Informatica S.p.A.](https://www.eng.it/).

# Licenza

Questo progetto è rilasciato sotto licenza GNU Affero General Public License v3.0 or later ([LICENSE.txt](LICENSE.txt)).

