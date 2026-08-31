.class public final LU4/y;
.super Ls5/i;
.source "SourceFile"

# interfaces
.implements LB5/e;


# instance fields
.field public final synthetic q:LM5/w;

.field public final synthetic r:LM/I0;


# direct methods
.method public constructor <init>(LM5/w;LM/I0;Lq5/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, LU4/y;->q:LM5/w;

    .line 2
    .line 3
    iput-object p2, p0, LU4/y;->r:LM/I0;

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
    new-instance p1, LU4/y;

    .line 2
    .line 3
    iget-object v0, p0, LU4/y;->q:LM5/w;

    .line 4
    .line 5
    iget-object v1, p0, LU4/y;->r:LM/I0;

    .line 6
    .line 7
    invoke-direct {p1, v0, v1, p2}, LU4/y;-><init>(LM5/w;LM/I0;Lq5/c;)V

    .line 8
    .line 9
    .line 10
    return-object p1
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
    invoke-virtual {p0, p1, p2}, LU4/y;->create(Ljava/lang/Object;Lq5/c;)Lq5/c;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, LU4/y;

    .line 10
    .line 11
    sget-object p2, Lm5/y;->a:Lm5/y;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, LU4/y;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    return-object p2
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    invoke-static {p1}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    new-instance p1, LU4/x;

    .line 5
    .line 6
    iget-object v0, p0, LU4/y;->r:LM/I0;

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    invoke-direct {p1, v0, v1}, LU4/x;-><init>(LM/I0;Lq5/c;)V

    .line 10
    .line 11
    .line 12
    const/4 v0, 0x3

    .line 13
    iget-object v2, p0, LU4/y;->q:LM5/w;

    .line 14
    .line 15
    invoke-static {v2, v1, v1, p1, v0}, LM5/y;->t(LM5/w;Lq5/h;LM5/x;LB5/e;I)LM5/B;

    .line 16
    .line 17
    .line 18
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 19
    .line 20
    return-object p1
.end method
