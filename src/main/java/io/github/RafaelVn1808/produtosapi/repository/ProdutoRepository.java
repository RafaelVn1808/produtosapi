package io.github.RafaelVn1808.produtosapi.repository;

import io.github.RafaelVn1808.produtosapi.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, String> {
}
