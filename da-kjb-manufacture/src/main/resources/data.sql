INSERT INTO Stock (stock_id, barang_id, nama_barang, stock_awal, stock_masuk, stock_terjual, stock_tersisa, harga_supplier, harga_jual)
VALUES (1, '1', 'clear assy',5,10,4,11,900000.00,1250000.00 ),
       (2, '2', 'regulator assy ',3,5,4,4,800000.00, 1000000.00),
       (3, '3', 'bumper',6,15,13,8,400000.00,500000.00);

INSERT INTO Distributor (distributor_id, nama_distributor, alamat, status)
VALUES (1, 'Dealer Resmi Tambal Sana Sini', 'Kebon Jeruk','Active'),
       (2, 'Bengkel Cepat Beres', 'Kebon Kacang','Active'),
       (3, 'Bengkel Pasang Beres', 'Patal Senayan', 'Active');