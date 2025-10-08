# Patrones Estructurales en Java 🧩

Este proyecto demuestra dos patrones estructurales implementados en **Java** siguiendo los principios **SOLID**:

## 📂 Estructura
src/
└── main/
└── java/
├── adapter/ → Patrón Adapter (Integración con servicio SOAP)
└── decorator/ → Patrón Decorator (Almacenamiento con cifrado y compresión)


## 🧠 Descripción

### 🧩 Patrón Adapter
Permite adaptar una interfaz REST para que se comunique con un servicio SOAP externo, sin modificar la lógica existente.

**Clases principales:**
- `Factura`
- `FacturaValidator`
- `FacturaValidatorSOAPAdapter`
- `ServicioSOAPExterno`

### 🧩 Patrón Decorator
Permite agregar funcionalidades adicionales a un componente de almacenamiento (como compresión o cifrado) sin modificar su estructura base.

**Clases principales:**
- `AlmacenadorBase`
- `AlmacenadorDecorador`
- `AlmacenadorComprimido`
- `AlmacenadorCifrado`

## 🚀 Ejecución
Ejecutar las clases `MainAdapterDemo` y `MainDecoratorDemo` para observar el funcionamiento por consola.

