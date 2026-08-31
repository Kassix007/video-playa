.class public final LD2/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LD2/q;


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
    iput-object p1, p0, LD2/a;->q:Landroidx/lifecycle/q;

    .line 5
    .line 6
    iput-object p2, p0, LD2/a;->r:LM5/b0;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 1

    .line 1
    iget-object v0, p0, LD2/a;->q:Landroidx/lifecycle/q;

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
    iget-object p1, p0, LD2/a;->r:LM5/b0;

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

.method public final start()V
    .locals 1

    .line 1
    iget-object v0, p0, LD2/a;->q:Landroidx/lifecycle/q;

    .line 2
    .line 3
    invoke-virtual {v0, p0}, Landroidx/lifecycle/q;->a(Landroidx/lifecycle/w;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
