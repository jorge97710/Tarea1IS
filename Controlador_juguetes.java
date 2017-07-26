
public class Controlador_juguetes {

		public int buscar_juguete(int codigo) {
			int c = 0;
			for (Juguete i : Controlador_usuario.juguetes) {
				if (i.getCodigo() == codigo) {
					c = Controlador_usuario.juguetes.indexOf(i);
				}
			}
			return c;
		}

		public void complejidad_Mec(int complejidad) {

			for (Juguete i : Controlador_usuario.juguetes) {
				if (i.isTipo()) {
					if (i.getComplejidad() == complejidad) {
						System.out.println(i.getCodigo());
					}
				}
			}

		}

		public void preciov_Elec() {

			// Collections.sort((List<>) Controlador_usuario.juguetes);
			for (Juguete i : Controlador_usuario.juguetes) {
				if (!i.isTipo()) {
					System.out.println(i.getCodigo());
				}
			}

		}

		public void juguete_Caro() {
			int tempmaxelec = 1;
			int tempmaxmec = 1;
			int maxmec = 1;
			int maxelec = 0;

			while (maxelec != tempmaxelec && maxmec != tempmaxmec) {

				for (Juguete i : Controlador_usuario.juguetes) {

					if (i.isTipo()) {
						tempmaxmec = i.getV_unitario();

						if (tempmaxmec > maxmec) {
							maxmec = tempmaxmec;
						}

					}

					if (!i.isTipo()) {
						tempmaxelec = i.getV_unitario();

						if (tempmaxelec > maxelec) {
							maxelec = tempmaxelec;
						}

					}

				}
			}

			int c = 0;
			int d = 0;
			for (Juguete i : Controlador_usuario.juguetes) {
				if (i.getV_unitario() == maxmec) {
					c = Controlador_usuario.juguetes.indexOf(i);
				}

				if (i.getV_unitario() == maxelec) {
					d = Controlador_usuario.juguetes.indexOf(i);

				}
			}
			int devolver;
			int realmec = maxmec
					+ (Controlador_usuario.juguetes.get(c).getComplejidad() * Controlador_usuario.juguetes
							.get(c).getComplejidad());
			int realelec = maxelec
					+ (2 * Controlador_usuario.juguetes.get(d).getComplejidad());

			if (realmec > realelec) {

				devolver = c;

			} else {
				devolver = d;
			}
			System.out.println("El codigo del juguete mas caro es: "
					+ Controlador_usuario.juguetes.get(devolver).getCodigo());

		}

		public void listar_mas_10() {
			// director
		}

		public void prov_por_tipo(boolean tipo) {

		}

		public void juguete_electronico() {

		}

	}
