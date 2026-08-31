.class public abstract Ls5/c;
.super Ls5/a;
.source "SourceFile"


# instance fields
.field private final _context:Lq5/h;

.field private transient intercepted:Lq5/c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lq5/c<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lq5/c;)V
    .locals 1

    if-eqz p1, :cond_0

    .line 3
    invoke-interface {p1}, Lq5/c;->getContext()Lq5/h;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-direct {p0, p1, v0}, Ls5/c;-><init>(Lq5/c;Lq5/h;)V

    return-void
.end method

.method public constructor <init>(Lq5/c;Lq5/h;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Ls5/a;-><init>(Lq5/c;)V

    .line 2
    iput-object p2, p0, Ls5/c;->_context:Lq5/h;

    return-void
.end method


# virtual methods
.method public getContext()Lq5/h;
    .locals 1

    .line 1
    iget-object v0, p0, Ls5/c;->_context:Lq5/h;

    .line 2
    .line 3
    invoke-static {v0}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public final intercepted()Lq5/c;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lq5/c<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Ls5/c;->intercepted:Lq5/c;

    .line 2
    .line 3
    if-nez v0, :cond_2

    .line 4
    .line 5
    invoke-virtual {p0}, Ls5/c;->getContext()Lq5/h;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    sget-object v1, Lq5/d;->q:Lq5/d;

    .line 10
    .line 11
    invoke-interface {v0, v1}, Lq5/h;->get(Lq5/g;)Lq5/f;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    check-cast v0, Lq5/e;

    .line 16
    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    invoke-interface {v0, p0}, Lq5/e;->interceptContinuation(Lq5/c;)Lq5/c;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    if-nez v0, :cond_1

    .line 24
    .line 25
    :cond_0
    move-object v0, p0

    .line 26
    :cond_1
    iput-object v0, p0, Ls5/c;->intercepted:Lq5/c;

    .line 27
    .line 28
    :cond_2
    return-object v0
.end method

.method public releaseIntercepted()V
    .locals 3

    .line 1
    iget-object v0, p0, Ls5/c;->intercepted:Lq5/c;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    if-eq v0, p0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Ls5/c;->getContext()Lq5/h;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    sget-object v2, Lq5/d;->q:Lq5/d;

    .line 12
    .line 13
    invoke-interface {v1, v2}, Lq5/h;->get(Lq5/g;)Lq5/f;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-static {v1}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    check-cast v1, Lq5/e;

    .line 21
    .line 22
    invoke-interface {v1, v0}, Lq5/e;->releaseInterceptedContinuation(Lq5/c;)V

    .line 23
    .line 24
    .line 25
    :cond_0
    sget-object v0, Ls5/b;->q:Ls5/b;

    .line 26
    .line 27
    iput-object v0, p0, Ls5/c;->intercepted:Lq5/c;

    .line 28
    .line 29
    return-void
.end method
