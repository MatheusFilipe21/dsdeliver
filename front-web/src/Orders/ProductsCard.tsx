import { Product } from "./types";

type Props = {
    product: Product;
}

function formatPrice(price: number){
    const formatter = new Intl.NumberFormat('pt-br', {
        style: 'currency',
        currency: 'BRL',

    });
    return formatter.format(price)
}

function ProductsCard({ product }: Props) {
    return (
        <div className="order-card-container">
            <h3 className="order-card-title">
                {product.name}
            </h3>

            <img src={product.imageUri} alt={product.name} className="order-card-image" />

            <h3 className="order-card-price">
                {formatPrice(product.price)}
            </h3>

            <div className="card-description">
                <h3>Descrição</h3>
                <p>
                    {product.description}
                </p>
            </div>
        </div>
    );
}

export default ProductsCard;