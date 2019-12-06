package com.example.android.guiapp;

public class Local {

    /** Nome */
    private String mNome;

    /** Horario de Funcionamento  */
    private String mHorario;

    /** Endereço */
    private String mEndereco;

    /** Telefone */
    private String mTelefone;

    /** Site */
    private String mSite;

    /** Descricao*/
    private String mDescricao;

    /** Imagem */
    private int mImagem = NO_IMAGE_PROVIDED;

    private static final int NO_IMAGE_PROVIDED = -1;


    public Local(String mNome, String mEndereco, String mTelefone, String mSite) {
        this.mNome = mNome;
        this.mEndereco = mEndereco;
        this.mTelefone = mTelefone;
        this.mSite = mSite;
    }

    public Local(String mNome, String mHorario, String mEndereco) {
        this.mNome = mNome;
        this.mHorario = mHorario;
        this.mEndereco = mEndereco;
    }

    public Local(String mNome, String mDescricao, String mEndereco, int mImagem) {
        this.mNome = mNome;
        this.mDescricao = mDescricao;
        this.mEndereco = mEndereco;
        this.mImagem = mImagem;
    }

    public String getmNome() {
        return mNome;
    }

    public String getmHorario() {
        return mHorario;
    }

    public String getmEndereco() {
        return mEndereco;
    }

    public String getmTelefone() {
        return mTelefone;
    }

    public String getmSite() {
        return mSite;
    }

    public String getmDescricao() {
        return mDescricao;
    }

    public int getmImagem() {
        return mImagem;
    }

    public boolean hasImage() {
        return mImagem != NO_IMAGE_PROVIDED;
    }
}
