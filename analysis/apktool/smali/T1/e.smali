.class public final LT1/e;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:LW1/d;


# direct methods
.method public constructor <init>(LT1/d;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, LW1/d;

    .line 3
    iget-object v1, p1, LT1/d;->r:LT1/p;

    .line 4
    iget-object v1, v1, LT1/p;->r:LW1/l;

    .line 5
    iget v1, v1, LW1/l;->a:I

    .line 6
    invoke-direct {v0, p1, v1}, LW1/d;-><init>(LT1/d;I)V

    iput-object v0, p0, LT1/e;->a:LW1/d;

    return-void
.end method

.method public constructor <init>(Landroid/os/Bundle;)V
    .locals 1

    const-string v0, "state"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    const-class v0, LT1/e;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->setClassLoader(Ljava/lang/ClassLoader;)V

    .line 9
    new-instance v0, LW1/d;

    invoke-direct {v0, p1}, LW1/d;-><init>(Landroid/os/Bundle;)V

    iput-object v0, p0, LT1/e;->a:LW1/d;

    return-void
.end method
