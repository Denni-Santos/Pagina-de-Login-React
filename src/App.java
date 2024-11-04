import React, { useState } from 'react';

const LoginPage = () => {
  const [cpf, setCpf] = useState('');
  const [password, setPassword] = useState('');

  const handleSubmit = (e) => {
    e.preventDefault();
    // Lógica de login aqui
    console.log('Login', { cpf, password });
  };

  const handleForgotPassword = () => {
    // Lógica de recuperação de senha aqui
    console.log('Recuperar senha');
  };

  return (
    <div>
      <h2>RifaSolidária - Login</h2>
      <form onSubmit={handleSubmit}>
        <div>
          <label htmlFor="cpf">CPF:</label>
          <input
            type="text"
            id="cpf"
            value={cpf}
            onChange={(e) => setCpf(e.target.value)}
            required
          />
        </div>
        <div>
          <label htmlFor="password">Senha:</label>
          <input
            type="password"
            id="password"
            value={password}
            onChange={(e) => setPassword(e.target.value)}
            required
          />
        </div>
        <button type="submit">Login</button>
      </form>
      <button onClick={handleForgotPassword}>Esqueci a Senha</button>
    </div>
  );
};

export default LoginPage;
