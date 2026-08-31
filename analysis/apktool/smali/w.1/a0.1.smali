.class public final Lw/a0;
.super Ls5/h;
.source "SourceFile"

# interfaces
.implements LB5/e;


# instance fields
.field public r:Ljava/lang/Object;

.field public s:I

.field public synthetic t:Ljava/lang/Object;

.field public final synthetic u:Lv/F;


# direct methods
.method public constructor <init>(Lv/F;Lq5/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lw/a0;->u:Lv/F;

    .line 2
    .line 3
    const/4 p1, 0x2

    .line 4
    invoke-direct {p0, p1, p2}, Ls5/h;-><init>(ILq5/c;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq5/c;)Lq5/c;
    .locals 2

    .line 1
    new-instance v0, Lw/a0;

    .line 2
    .line 3
    iget-object v1, p0, Lw/a0;->u:Lv/F;

    .line 4
    .line 5
    invoke-direct {v0, v1, p2}, Lw/a0;-><init>(Lv/F;Lq5/c;)V

    .line 6
    .line 7
    .line 8
    iput-object p1, v0, Lw/a0;->t:Ljava/lang/Object;

    .line 9
    .line 10
    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, LI5/j;

    .line 2
    .line 3
    check-cast p2, Lq5/c;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Lw/a0;->create(Ljava/lang/Object;Lq5/c;)Lq5/c;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Lw/a0;

    .line 10
    .line 11
    sget-object p2, Lm5/y;->a:Lm5/y;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, Lw/a0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget v0, p0, Lw/a0;->s:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-eqz v0, :cond_1

    .line 5
    .line 6
    if-ne v0, v1, :cond_0

    .line 7
    .line 8
    iget-object v0, p0, Lw/a0;->r:Ljava/lang/Object;

    .line 9
    .line 10
    iget-object v2, p0, Lw/a0;->t:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v2, LI5/j;

    .line 13
    .line 14
    invoke-static {p1}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 19
    .line 20
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 21
    .line 22
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    throw p1

    .line 26
    :cond_1
    invoke-static {p1}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    iget-object p1, p0, Lw/a0;->t:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast p1, LI5/j;

    .line 32
    .line 33
    move-object v2, p1

    .line 34
    :cond_2
    iget-object p1, p0, Lw/a0;->u:Lv/F;

    .line 35
    .line 36
    invoke-virtual {p1}, Lv/F;->invoke()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    if-eqz p1, :cond_3

    .line 41
    .line 42
    iput-object v2, p0, Lw/a0;->t:Ljava/lang/Object;

    .line 43
    .line 44
    iput-object p1, p0, Lw/a0;->r:Ljava/lang/Object;

    .line 45
    .line 46
    iput v1, p0, Lw/a0;->s:I

    .line 47
    .line 48
    invoke-virtual {v2, p1, p0}, LI5/j;->b(Ljava/lang/Object;Ls5/h;)V

    .line 49
    .line 50
    .line 51
    sget-object p1, Lr5/a;->q:Lr5/a;

    .line 52
    .line 53
    return-object p1

    .line 54
    :cond_3
    const/4 v0, 0x0

    .line 55
    :goto_0
    if-nez v0, :cond_2

    .line 56
    .line 57
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 58
    .line 59
    return-object p1
.end method
