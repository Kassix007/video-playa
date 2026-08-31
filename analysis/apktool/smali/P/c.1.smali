.class public interface abstract LP/c;
.super Ljava/lang/Object;
.source "SourceFile"


# virtual methods
.method public abstract c(ILjava/lang/Object;)V
.end method

.method public abstract d(Ljava/lang/Object;)V
.end method

.method public f()V
    .locals 2

    .line 1
    invoke-interface {p0}, LP/c;->j()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    instance-of v1, v0, LP/i;

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    check-cast v0, LP/i;

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 v0, 0x0

    .line 13
    :goto_0
    if-eqz v0, :cond_1

    .line 14
    .line 15
    invoke-interface {v0}, LP/i;->e()V

    .line 16
    .line 17
    .line 18
    :cond_1
    return-void
.end method

.method public abstract h(ILjava/lang/Object;)V
.end method

.method public abstract i(III)V
.end method

.method public abstract j()Ljava/lang/Object;
.end method

.method public abstract k(II)V
.end method

.method public abstract o()V
.end method
