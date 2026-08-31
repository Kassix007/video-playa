.class public final LU2/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LU2/o;
.implements Landroidx/lifecycle/f;


# instance fields
.field public final q:Landroidx/lifecycle/q;

.field public final r:LM5/b0;


# direct methods
.method public constructor <init>(Landroidx/lifecycle/q;LM5/b0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LU2/k;->q:Landroidx/lifecycle/q;

    .line 5
    .line 6
    iput-object p2, p0, LU2/k;->r:LM5/b0;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 1

    .line 1
    iget-object v0, p0, LU2/k;->q:Landroidx/lifecycle/q;

    .line 2
    .line 3
    invoke-virtual {v0, p0}, Landroidx/lifecycle/q;->c(Landroidx/lifecycle/w;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final c(Landroidx/lifecycle/x;)V
    .locals 1

    .line 1
    iget-object p1, p0, LU2/k;->r:LM5/b0;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    invoke-interface {p1, v0}, LM5/b0;->a(Ljava/util/concurrent/CancellationException;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public final d(LI2/w;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, LU2/k;->q:Landroidx/lifecycle/q;

    .line 2
    .line 3
    invoke-static {v0, p1}, LD5/a;->n(Landroidx/lifecycle/q;Ls5/c;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    sget-object v0, Lr5/a;->q:Lr5/a;

    .line 8
    .line 9
    if-ne p1, v0, :cond_0

    .line 10
    .line 11
    return-object p1

    .line 12
    :cond_0
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 13
    .line 14
    return-object p1
.end method

.method public final start()V
    .locals 1

    .line 1
    iget-object v0, p0, LU2/k;->q:Landroidx/lifecycle/q;

    .line 2
    .line 3
    invoke-virtual {v0, p0}, Landroidx/lifecycle/q;->a(Landroidx/lifecycle/w;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
