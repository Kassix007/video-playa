.class public final LP/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lq5/f;


# static fields
.field public static final q:LP/S;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, LP/S;

    .line 2
    .line 3
    const/4 v1, 0x5

    .line 4
    invoke-direct {v0, v1}, LP/S;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sput-object v0, LP/f;->q:LP/S;

    .line 8
    .line 9
    return-void
.end method


# virtual methods
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

.method public final getKey()Lq5/g;
    .locals 1

    .line 1
    sget-object v0, LP/f;->q:LP/S;

    .line 2
    .line 3
    return-object v0
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
