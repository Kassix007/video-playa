.class public final Lb/x;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/window/OnBackAnimationCallback;


# instance fields
.field public final synthetic a:Lb/v;

.field public final synthetic b:Lb/v;

.field public final synthetic c:Lb/w;

.field public final synthetic d:Lb/w;


# direct methods
.method public constructor <init>(Lb/v;Lb/v;Lb/w;Lb/w;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lb/x;->a:Lb/v;

    .line 5
    .line 6
    iput-object p2, p0, Lb/x;->b:Lb/v;

    .line 7
    .line 8
    iput-object p3, p0, Lb/x;->c:Lb/w;

    .line 9
    .line 10
    iput-object p4, p0, Lb/x;->d:Lb/w;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final onBackCancelled()V
    .locals 1

    .line 1
    iget-object v0, p0, Lb/x;->d:Lb/w;

    .line 2
    .line 3
    invoke-virtual {v0}, Lb/w;->invoke()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final onBackInvoked()V
    .locals 1

    .line 1
    iget-object v0, p0, Lb/x;->c:Lb/w;

    .line 2
    .line 3
    invoke-virtual {v0}, Lb/w;->invoke()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final onBackProgressed(Landroid/window/BackEvent;)V
    .locals 1

    .line 1
    const-string v0, "backEvent"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Lb/a;

    .line 7
    .line 8
    invoke-direct {v0, p1}, Lb/a;-><init>(Landroid/window/BackEvent;)V

    .line 9
    .line 10
    .line 11
    iget-object p1, p0, Lb/x;->b:Lb/v;

    .line 12
    .line 13
    invoke-virtual {p1, v0}, Lb/v;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final onBackStarted(Landroid/window/BackEvent;)V
    .locals 1

    .line 1
    const-string v0, "backEvent"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Lb/a;

    .line 7
    .line 8
    invoke-direct {v0, p1}, Lb/a;-><init>(Landroid/window/BackEvent;)V

    .line 9
    .line 10
    .line 11
    iget-object p1, p0, Lb/x;->a:Lb/v;

    .line 12
    .line 13
    invoke-virtual {p1, v0}, Lb/v;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    return-void
.end method
