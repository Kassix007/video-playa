.class public abstract Lq5/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lq5/f;


# instance fields
.field private final key:Lq5/g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lq5/g;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lq5/g;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lq5/a;->key:Lq5/g;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public fold(Ljava/lang/Object;LB5/e;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            ">(TR;",
            "LB5/e;",
            ")TR;"
        }
    .end annotation

    .line 1
    const-string v0, "operation"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-interface {p2, p1, p0}, LB5/e;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    return-object p1
.end method

.method public get(Lq5/g;)Lq5/f;
    .locals 0

    .line 1
    invoke-static {p0, p1}, LE3/h;->A(Lq5/f;Lq5/g;)Lq5/f;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public getKey()Lq5/g;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lq5/g;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lq5/a;->key:Lq5/g;

    .line 2
    .line 3
    return-object v0
.end method

.method public minusKey(Lq5/g;)Lq5/h;
    .locals 0

    .line 1
    invoke-static {p0, p1}, LE3/h;->I(Lq5/f;Lq5/g;)Lq5/h;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public plus(Lq5/h;)Lq5/h;
    .locals 0

    .line 1
    invoke-static {p0, p1}, LE3/h;->L(Lq5/f;Lq5/h;)Lq5/h;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method
