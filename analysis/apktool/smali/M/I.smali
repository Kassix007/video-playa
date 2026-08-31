.class public final LM/I;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/window/OnBackAnimationCallback;


# instance fields
.field public final synthetic a:LM5/w;

.field public final synthetic b:Lu/c;

.field public final synthetic c:LB5/a;


# direct methods
.method public constructor <init>(LB5/a;Lu/c;LM5/w;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p3, p0, LM/I;->a:LM5/w;

    .line 5
    .line 6
    iput-object p2, p0, LM/I;->b:Lu/c;

    .line 7
    .line 8
    iput-object p1, p0, LM/I;->c:LB5/a;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final onBackCancelled()V
    .locals 4

    .line 1
    new-instance v0, LM/F;

    .line 2
    .line 3
    iget-object v1, p0, LM/I;->b:Lu/c;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, LM/F;-><init>(Lu/c;Lq5/c;)V

    .line 7
    .line 8
    .line 9
    const/4 v1, 0x3

    .line 10
    iget-object v3, p0, LM/I;->a:LM5/w;

    .line 11
    .line 12
    invoke-static {v3, v2, v2, v0, v1}, LM5/y;->t(LM5/w;Lq5/h;LM5/x;LB5/e;I)LM5/B;

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public final onBackInvoked()V
    .locals 1

    .line 1
    iget-object v0, p0, LM/I;->c:LB5/a;

    .line 2
    .line 3
    invoke-interface {v0}, LB5/a;->invoke()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final onBackProgressed(Landroid/window/BackEvent;)V
    .locals 3

    .line 1
    new-instance v0, LM/G;

    .line 2
    .line 3
    iget-object v1, p0, LM/I;->b:Lu/c;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, p1, v2}, LM/G;-><init>(Lu/c;Landroid/window/BackEvent;Lq5/c;)V

    .line 7
    .line 8
    .line 9
    const/4 p1, 0x3

    .line 10
    iget-object v1, p0, LM/I;->a:LM5/w;

    .line 11
    .line 12
    invoke-static {v1, v2, v2, v0, p1}, LM5/y;->t(LM5/w;Lq5/h;LM5/x;LB5/e;I)LM5/B;

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public final onBackStarted(Landroid/window/BackEvent;)V
    .locals 3

    .line 1
    new-instance v0, LM/H;

    .line 2
    .line 3
    iget-object v1, p0, LM/I;->b:Lu/c;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, p1, v2}, LM/H;-><init>(Lu/c;Landroid/window/BackEvent;Lq5/c;)V

    .line 7
    .line 8
    .line 9
    const/4 p1, 0x3

    .line 10
    iget-object v1, p0, LM/I;->a:LM5/w;

    .line 11
    .line 12
    invoke-static {v1, v2, v2, v0, p1}, LM5/y;->t(LM5/w;Lq5/h;LM5/x;LB5/e;I)LM5/B;

    .line 13
    .line 14
    .line 15
    return-void
.end method
