.class public final synthetic LN5/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LM5/J;


# instance fields
.field public final synthetic q:LN5/f;

.field public final synthetic r:LM5/v0;


# direct methods
.method public synthetic constructor <init>(LN5/f;LM5/v0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LN5/e;->q:LN5/f;

    iput-object p2, p0, LN5/e;->r:LM5/v0;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    .line 1
    iget-object v0, p0, LN5/e;->r:LM5/v0;

    .line 2
    .line 3
    iget-object v1, p0, LN5/e;->q:LN5/f;

    .line 4
    .line 5
    iget-object v1, v1, LN5/f;->q:Landroid/os/Handler;

    .line 6
    .line 7
    invoke-virtual {v1, v0}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method
