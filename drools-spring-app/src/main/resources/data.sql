
INSERT INTO glavna_stanica (naziv,lokacija,nivo_vode, min_vode, max_vode, otvorena, stanje, moja_prognoza) VALUES ('Glavna stanica Liman 2', 'Novi Sad', '12.0', '5.0','22.0', 0, 0, 0);
INSERT INTO merna_stanica(naziv, lokacija, nivo_vode, max_nivo, padavine, aktivna,glavna_stanica_id,alarm) VALUES ('Merna stanica Futog', '- Futog' , '11.1', '22.0', '0.0', 1 , 1,0);
INSERT INTO merna_stanica(naziv, lokacija, nivo_vode, max_nivo, padavine, aktivna,glavna_stanica_id,alarm) VALUES ('Merna stanica Telep', '- Telep' , '10.2', '20.0', '3.0', 1 , 1,0);
INSERT INTO merna_stanica(naziv, lokacija, nivo_vode, max_nivo, padavine, aktivna,glavna_stanica_id,alarm) VALUES ('Merna stanica Strand', '+ Strand' , '8.5', '14.0', '1.0', 1 , 1,0);

