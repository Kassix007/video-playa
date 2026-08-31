.class public final LD/x;
.super Ls5/i;
.source "SourceFile"

# interfaces
.implements LB5/e;


# instance fields
.field public final synthetic q:LD/y;

.field public final synthetic r:I


# direct methods
.method public constructor <init>(LD/y;ILq5/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, LD/x;->q:LD/y;

    .line 2
    .line 3
    iput p2, p0, LD/x;->r:I

    .line 4
    .line 5
    const/4 p1, 0x2

    .line 6
    invoke-direct {p0, p1, p3}, Ls5/i;-><init>(ILq5/c;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq5/c;)Lq5/c;
    .locals 2

    .line 1
    new-instance p1, LD/x;

    .line 2
    .line 3
    iget-object v0, p0, LD/x;->q:LD/y;

    .line 4
    .line 5
    iget v1, p0, LD/x;->r:I

    .line 6
    .line 7
    invoke-direct {p1, v0, v1, p2}, LD/x;-><init>(LD/y;ILq5/c;)V

    .line 8
    .line 9
    .line 10
    return-object p1
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lw/i0;

    .line 2
    .line 3
    check-cast p2, Lq5/c;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, LD/x;->create(Ljava/lang/Object;Lq5/c;)Lq5/c;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, LD/x;

    .line 10
    .line 11
    sget-object p2, Lm5/y;->a:Lm5/y;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, LD/x;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    return-object p2
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    invoke-static {p1}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    iget-object p1, p0, LD/x;->q:LD/y;

    .line 5
    .line 6
    iget-object v0, p1, LD/y;->d:LC/u;

    .line 7
    .line 8
    iget-object v1, v0, LC/u;->b:LP/c0;

    .line 9
    .line 10
    invoke-virtual {v1}, LP/c0;->e()I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    const/4 v2, 0x0

    .line 15
    iget v3, p0, LD/x;->r:I

    .line 16
    .line 17
    if-ne v1, v3, :cond_0

    .line 18
    .line 19
    iget-object v1, v0, LC/u;->c:LP/c0;

    .line 20
    .line 21
    invoke-virtual {v1}, LP/c0;->e()I

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    if-eqz v1, :cond_1

    .line 26
    .line 27
    :cond_0
    iget-object v1, p1, LD/y;->m:Landroidx/compose/foundation/lazy/layout/b;

    .line 28
    .line 29
    invoke-virtual {v1}, Landroidx/compose/foundation/lazy/layout/b;->d()V

    .line 30
    .line 31
    .line 32
    iput-object v2, v1, Landroidx/compose/foundation/lazy/layout/b;->b:LE/Y;

    .line 33
    .line 34
    :cond_1
    const/4 v1, 0x0

    .line 35
    invoke-virtual {v0, v3, v1}, LC/u;->a(II)V

    .line 36
    .line 37
    .line 38
    iput-object v2, v0, LC/u;->e:Ljava/lang/Object;

    .line 39
    .line 40
    iget-object p1, p1, LD/y;->j:LB0/L;

    .line 41
    .line 42
    if-eqz p1, :cond_2

    .line 43
    .line 44
    invoke-virtual {p1}, LB0/L;->l()V

    .line 45
    .line 46
    .line 47
    :cond_2
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 48
    .line 49
    return-object p1
.end method
