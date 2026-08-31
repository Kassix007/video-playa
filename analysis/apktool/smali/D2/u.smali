.class public final LD2/u;
.super Ls5/i;
.source "SourceFile"

# interfaces
.implements LB5/e;


# instance fields
.field public final synthetic q:LD2/v;


# direct methods
.method public constructor <init>(LD2/v;Lq5/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, LD2/u;->q:LD2/v;

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
    .locals 1

    .line 1
    new-instance p1, LD2/u;

    .line 2
    .line 3
    iget-object v0, p0, LD2/u;->q:LD2/v;

    .line 4
    .line 5
    invoke-direct {p1, v0, p2}, LD2/u;-><init>(LD2/v;Lq5/c;)V

    .line 6
    .line 7
    .line 8
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
    invoke-virtual {p0, p1, p2}, LD2/u;->create(Ljava/lang/Object;Lq5/c;)Lq5/c;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, LD2/u;

    .line 10
    .line 11
    sget-object p2, Lm5/y;->a:Lm5/y;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, LD2/u;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    iget-object p1, p0, LD2/u;->q:LD2/v;

    .line 5
    .line 6
    iget-object v0, p1, LD2/v;->s:LD2/t;

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    iget-object v2, v0, LD2/t;->t:Landroidx/lifecycle/q;

    .line 12
    .line 13
    iget-object v3, v0, LD2/t;->u:LM5/b0;

    .line 14
    .line 15
    invoke-interface {v3, v1}, LM5/b0;->a(Ljava/util/concurrent/CancellationException;)V

    .line 16
    .line 17
    .line 18
    iget-object v3, v0, LD2/t;->s:LF2/a;

    .line 19
    .line 20
    if-eqz v3, :cond_0

    .line 21
    .line 22
    invoke-virtual {v2, v3}, Landroidx/lifecycle/q;->c(Landroidx/lifecycle/w;)V

    .line 23
    .line 24
    .line 25
    :cond_0
    invoke-virtual {v2, v0}, Landroidx/lifecycle/q;->c(Landroidx/lifecycle/w;)V

    .line 26
    .line 27
    .line 28
    :cond_1
    iput-object v1, p1, LD2/v;->s:LD2/t;

    .line 29
    .line 30
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 31
    .line 32
    return-object p1
.end method
