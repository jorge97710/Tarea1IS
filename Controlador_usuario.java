import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Controlador_usuario {
	int tipo;
	boolean autorizacionCaja = false;
	boolean autorizacionInventario = false;
	int resp = 11;
	int nresp = 3;
	Controlador_juguetes control;

	// MI lista de juguetes con todas sus cosas
	static List<Juguete> juguetes = new ArrayList<Juguete>();
	static List<Proveedores> proveedores = new ArrayList<Proveedores>();
	Scanner sn = new Scanner(System.in);

	public Controlador_usuario(int tipo) {
		control = new Controlador_juguetes();
		this.tipo = tipo;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public void mostrarMenu() {
		while (resp != 0) {
			if (tipo >= 1) {
				System.out.println("1. Buscar Juguete (codigo)"); // visualizar
				// juguetes,
				// categorias
				// y precios
				System.out.println("2. Juguetes mecanicos segun complejidad");
				System.out.println("3. Juguetes electronicos y precios");
				if (tipo >= 2 || autorizacionCaja == true
						|| autorizacionInventario == true) {
					System.out.println("4. Editar juguete"); // ademas, editar
					// cantidades en
					// existencia y
					// precios,
					// agregar
					// nuevos
					// productos
					System.out.println("5. Agregar(x) o eliminar(y) juguete"); // ademas,
					// editar
					// cantidades
					// en
					// existencia
					// y
					// precios,
					// agregar
					// nuevos
					// productos
					System.out.println("6. Agregar(x) o eliminar(y) proveedor"); // ademas,
					// editar
					// cantidades
					// en
					// existencia
					// y
					// precios,
					// agregar
					// nuevos
					// productos
				}
				if (tipo == 3 || autorizacionCaja == true || autorizacionInventario == true) {
					System.out.println("7. Dar acceso a encargado de caja");
					System.out.println("8. Dar acceso a encargado de inventario");
					System.out.println("9. Estadisticas de ventas");
				} else {
					System.out.println("Debe de ingresar un numero entre 0 y 9");
				}
				System.out.println("0. Salir");
				resp = sn.nextInt();

				if (resp == 1) {
					System.out
							.println("Ingrese el codigo del jueguete que desea buscar");
					int codigojuguete = sn.nextInt();
					int pos = control.buscar_juguete(codigojuguete);
					if (pos == 0) {
						System.out.println("El juguete no se encontro");
					} else {
						if (juguetes.get(pos).isTipo()) {
							System.out
									.println("El juguete si esta en el inventario y es mecanico  ");
							System.out
									.println("El juguete tiene un precio de: "
											+ (juguetes.get(pos)
													.getV_unitario() + (juguetes
													.get(pos).getComplejidad() * juguetes
													.get(pos).getComplejidad())));
						} else {
							System.out
									.println("El juguete si esta en el inventario y es electrico ");
							System.out
									.println("El juguete tiene un precio de: "
											+ (2 * juguetes.get(pos)
													.getComplejidad()));

						}

					}
				}
				// muestra los codigos de los juguetes mecanicos que cumplen con
				// la complejidad seleccionada
				if (resp == 2) {
					System.out
							.println("Ingrese la complejidad de la que desea buscar (1,2,3) o 4 para salir ");
					int respuesta = sn.nextInt();
					if (respuesta == 4) {

					} else {
						control.complejidad_Mec(respuesta);

					}

				}
				if (resp == 3) {
					control.preciov_Elec();
				}

				if (resp == 4) {
					System.out
							.println("Ingrese el codigo del juguete del cual desea modificar datos, si desea salir ingrese (0)");
					int codigojuguete = sn.nextInt();
					int pos = control.buscar_juguete(codigojuguete);
					if (pos == 0) {
						System.out.println("El juguete no se encontro");
					} else {
						System.out
								.println("Seleccione que opcion desea modificar o (0) para salir");
						System.out.println("1) codigo");
						System.out.println("2) valor unitario ");
						System.out.println("3) marca ");
						System.out.println("4) edad minima ");
						System.out.println("5) tipo de juguete");
						System.out.println("6) cantidad en inventario ");
						System.out.println("7) complejidad juguete");
						System.out.println("0) salir");
						int otraopcion = sn.nextInt();

						if (otraopcion == 1) {
							System.out.println("ingrese nuevo valor");
							int nc = sn.nextInt();
							Controlador_usuario.juguetes.get(pos).setCodigo(nc);
						}
						if (otraopcion == 2) {
							System.out.println("ingrese nuevo valor");
							int nc = sn.nextInt();
							Controlador_usuario.juguetes.get(pos)
									.setV_unitario(nc);
						}
						if (otraopcion == 3) {
							System.out.println("ingrese nuevo valor");
							String nc = sn.nextLine();
							Controlador_usuario.juguetes.get(pos).setMarca(nc);
						}
						if (otraopcion == 4) {
							System.out.println("ingrese nuevo valor");
							int nc = sn.nextInt();
							Controlador_usuario.juguetes.get(pos).setEdad_min(
									nc);
						}
						if (otraopcion == 5) {
							System.out
									.println("ingrese nuevo valor (0-electrico, 1-mecanico)");
							int nc = sn.nextInt();
							boolean nv;
							if (nc == 0) {
								nv = false;
							} else {
								nv = true;
							}
							Controlador_usuario.juguetes.get(pos).setTipo(nv);
						}
						if (otraopcion == 6) {
							System.out.println("ingrese nuevo valor");
							int nc = sn.nextInt();
							Controlador_usuario.juguetes.get(pos).setCantidad(
									nc);
						}
						if (otraopcion == 7) {
							System.out.println("ingrese nuevo valor");
							int nc = sn.nextInt();
							Controlador_usuario.juguetes.get(pos)
									.setComplejidad(nc);
						}

					}

				}
				if (resp == 5) {
					System.out
							.println("¿Desea agregar(0) o eliminar juguete(1)? si desea salir ingrese (3) ");
					nresp = sn.nextInt();
					String marca = "";
					int codigo_juguete;
					int val_unit;
					int min;
					int tipoj;
					int cantinventario;
					int complex;
					boolean tipodejuguete;
					while (nresp != 3) {
						if (nresp == 0) {

							System.out
									.println("Ingrese el codigo del juguete:");
							codigo_juguete = sn.nextInt();
							
							System.out.println("Ingrese el valor unitario del juguete");
							val_unit = sn.nextInt();
							
							System.out.println("Ingrese la marca del juguete ");
							marca = sn.nextLine();
							//pasarlo a String
							marca.toString();
							
							System.out.println("Ingrese la edad minima para utilizar el juguete");
							min = sn.nextInt();
							
							System.out.println("Ingrese el tipo de juguete (0-electrico, 1-mecanico)");
							tipoj = sn.nextInt();
							
							if (tipoj == 0) {
								tipodejuguete = false; // electrico
							} else {
								tipodejuguete = true; // mecanico
							}
							System.out
									.println("Ingrese la cantidad de juguetes en inventario");
							cantinventario = sn.nextInt();
							System.out
									.println("Ingrese la complejidad del juguete (1,2,3)");
							complex = sn.nextInt();
							
							juguetes.add(new Juguete(codigo_juguete, val_unit,
									marca, min, tipodejuguete, cantinventario,
									complex));

						}
						if (nresp == 1) {
							System.out
									.println("Ingrese el codigo del juguete que desea eliminar, si desea salir ingrese (0)");
							int respuesta = sn.nextInt();

							int pos = control.buscar_juguete(respuesta);
							if (pos == 0) {
								System.out.println("El juguete no se encontro");
							} else {
								juguetes.remove(pos);

							}

							if (respuesta == 0) {
								nresp = 3;
							}

						}
						if (nresp != 0 && nresp != 1) {
							System.out
									.println("Opcion invalida, ingrese de nuevo ");
						}
					
						nresp = 3;
					}
					if (resp == 6) {

						System.out
								.println("¿Desea agregar(0) o eliminar proveedor(1)? si desea salir ingrese (3) ");
						nresp = sn.nextInt();
						while (nresp != 3) {
							if (nresp == 0) {

								System.out
										.println("Ingrese el nombre del proveedor");
								String nombre = sn.nextLine();
								System.out
										.println("Ingrese el numero/codigo del proveedor:");
								int codigo_proveedor = sn.nextInt();
								proveedores.add(new Proveedores(nombre,codigo_proveedor, null));

							}
							if (nresp == 1) {
								System.out
										.println("Ingrese el codigo del proveedor que desea eliminar, si desea salir ingrese (0)");
								int respuesta = sn.nextInt();

								int pos = 0;
								for (Proveedores i : proveedores) {
									if (i.getCodigo_proveedor() == respuesta) {
										pos = Controlador_usuario.juguetes
												.indexOf(i);
									}
								}
								// int pos = control.buscar_juguete(respuesta);
								if (pos == 0) {
									System.out
											.println("El juguete no se encontro");
								} else {
									proveedores.remove(pos);

									if (respuesta == 0) {
										nresp = 3;
									}

								}
								if (nresp != 0 && nresp != 1) {
									System.out
											.println("Opcion invalida, ingrese de nuevo ");
								}
							}
							nresp = 3;
						}
						if (resp == 7) {
							//Caja
							autorizacionCaja = true;
							System.out.println("Se ha autorizado al encargado de la caja, acceso total");
						}
						if (resp == 8) {
							//inventario
							autorizacionInventario = true;
							System.out.println("Se ha autorizado al encargado del inventario, acceso total");

						}
						if (resp == 9) {
							//estadistico de venta
							control.juguete_Caro();
						}
					}

				}
			}

		}
	}
}

