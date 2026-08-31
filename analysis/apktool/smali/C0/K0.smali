.class public final LC0/K0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc0/p;


# instance fields
.field public final q:LP/b0;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, LP/b0;

    .line 5
    .line 6
    const/high16 v1, 0x3f800000    # 1.0f

    .line 7
    .line 8
    invoke-direct {v0, v1}, LP/b0;-><init>(F)V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, LC0/K0;->q:LP/b0;

    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final K()F
    .locals 1

    .line 1
    iget-object v0, p0, LC0/K0;->q:LP/b0;

    .line 2
    .line 3
    invoke-virtual {v0}, LP/b0;->e()F

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public final fold(Ljava/lang/Object;LB5/e;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-interface {p2, p1, p0}, LB5/e;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public final get(Lq5/g;)Lq5/f;
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

.method public final minusKey(Lq5/g;)Lq5/h;
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

.method public final plus(Lq5/h;)Lq5/h;
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
