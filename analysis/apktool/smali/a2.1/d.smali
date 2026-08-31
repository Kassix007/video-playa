.class public final La2/d;
.super Ls5/i;
.source "SourceFile"

# interfaces
.implements LB5/e;


# instance fields
.field public synthetic q:Ljava/lang/Object;

.field public final synthetic r:La2/e;


# direct methods
.method public constructor <init>(La2/e;Lq5/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, La2/d;->r:La2/e;

    .line 2
    .line 3
    const/4 p1, 0x2

    .line 4
    invoke-direct {p0, p1, p2}, Ls5/i;-><init>(ILq5/c;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq5/c;)Lq5/c;
    .locals 2

    .line 1
    new-instance v0, La2/d;

    .line 2
    .line 3
    iget-object v1, p0, La2/d;->r:La2/e;

    .line 4
    .line 5
    invoke-direct {v0, v1, p2}, La2/d;-><init>(La2/e;Lq5/c;)V

    .line 6
    .line 7
    .line 8
    iput-object p1, v0, La2/d;->q:Ljava/lang/Object;

    .line 9
    .line 10
    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, LM5/w;

    .line 2
    .line 3
    check-cast p2, Lq5/c;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, La2/d;->create(Ljava/lang/Object;Lq5/c;)Lq5/c;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, La2/d;

    .line 10
    .line 11
    sget-object p2, Lm5/y;->a:Lm5/y;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, La2/d;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    const/4 p1, 0x0

    .line 17
    throw p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-static {p1}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    iget-object p1, p0, La2/d;->q:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast p1, LM5/w;

    .line 7
    .line 8
    const/4 p1, 0x0

    .line 9
    throw p1
.end method
