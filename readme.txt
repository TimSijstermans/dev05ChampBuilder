====================================================================
  ___ _                    _            ___      _ _    _         
 / __| |_  __ _ _ __  _ __(_)___ _ _   | _ )_  _(_) |__| |___ _ _ 
| (__| ' \/ _` | '  \| '_ \ / _ \ ' \  | _ \ || | | / _` / -_) '_|
 \___|_||_\__,_|_|_|_| .__/_\___/_||_| |___/\_,_|_|_\__,_\___|_|  
                     |_|
====================================================================
Door:
Tim Sijstermans : 0862121
Axel Schelfhout : 0861956

Taal: Java 
IDE: Eclipse

Gebruikte patterns:
- Abstract factory
- MVC
- Composite
- Decorator


====================================================================
  _____        __                           _   _             
 |_   _|      / _|                         | | (_)            
   | |  _ __ | |_ ___  _ __ _ __ ___   __ _| |_ _  ___  _ __  
   | | | '_ \|  _/ _ \| '__| '_ ` _ \ / _` | __| |/ _ \| '_ \ 
  _| |_| | | | || (_) | |  | | | | | | (_| | |_| | (_) | | | |
 |_____|_| |_|_| \___/|_|  |_| |_| |_|\__,_|\__|_|\___/|_| |_|
                                                              
====================================================================


Champion Builder is een applicatie geinspireerd door het online spel: League of Legends.
In deze app kan er een Champion gekozen worden, wij hebben 2 Champions geimplementeerd.
Champions hebben een aantal stats, onderanderen: HP en MP.
Nadat de champion is gekozen, kan er een "Item" aan toegevoegd worden. Door deze items veranderen
de stats van de champion. 
Eventueel kan er ook nog een "Skin" aan toegevoegd worden. Dit is een ander uiterlijk
voor de champion.

Vanuit de main wordt de controller geladen. In de controller wordt de view en de model (de champion)
aangesproken. De view laat alles zien van de champion zodra de knoppen bediend worden. (MVC)
Vanuit de overkoepelende champion klasse worden de decorator en de verschillende champions ingeladen.
Nadat er een champion is gekozen kan er een item worden toegevoegd, dit item voegt via een Composite 
pattern verschillende bonus stats aan de champion toe.

Verdere toelichting in de code.

