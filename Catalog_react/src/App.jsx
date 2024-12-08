import { useState } from 'react'
import reactLogo from './assets/react.svg'
import viteLogo from '/vite.svg'
import './App.css'
import { use } from 'react'

function App() {
  const [products,Setproducts] = useState([]);

  useEffect(() => {
    fetch('http://localhost:8081/api/v1/products')
    .then(res => res.json())
    .then(data => Setproducts(data))
  } ,[]);

  return (
    <div className='container'>
      {products.length ? (
         //Display the products
         <ProductList products={products} />
      ) : (
        <p>No products found</p>
      )}

    </div>
  )
}
