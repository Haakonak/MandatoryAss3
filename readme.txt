Assignment 3 Oppgave A

Table: { 0, 10, 5, 9999, 3, 12 } 
       { 10, 0, 17, 9, 17, 12 } 
       { 5, 17, 0, 35, 3, 12 }
       { 9999, 9, 35, 0, 9999, 12 } 
       { 3, 17, 3, 9999, 0, 12 } 
       { 12, 12, 12, 12, 12, 0 } 

Finn enkleste vei fra A-F og F-A pluss alt mellom.

Få algoritmen til kjøre gjennom alle nodene slik at den finner raskest vei. 
Algoritmen skal lete etter den "billigste" veien til hver node. 
Start på A og finn billigste rute til de andre nodene.
Hvis man oppdager at noden "under" er billigere enn den som er på samme linje, 
så bruker man den billigste.

Koden endte opp slik fordi det var den enkleste måten å få kjørt igjennom tabellen 
som jeg klarte å lage/finne.

Jeg klarte ikke å få outputen til å si hvilken bokstav det gjaldt, slik som "Lengden fra A til C er 5" 
og måtte derfor bruke source for å sikre at programmet kjørte gjennom tabellen slik som jeg ønsket. 
Dette gjorde at outputen ble slik som i det vedlagte bildet, med "Lengden fra 0 til 2 er 5".