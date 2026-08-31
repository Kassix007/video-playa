.class public final synthetic Lg5/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnCancelListener;


# instance fields
.field public final synthetic q:LI2/d;

.field public final synthetic r:Lg5/h;


# direct methods
.method public synthetic constructor <init>(LI2/d;Lg5/h;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg5/g;->q:LI2/d;

    iput-object p2, p0, Lg5/g;->r:Lg5/h;

    return-void
.end method


# virtual methods
.method public final onCancel(Landroid/content/DialogInterface;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lg5/g;->q:LI2/d;

    .line 2
    .line 3
    invoke-virtual {p1}, LI2/d;->invoke()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    const/4 p1, 0x0

    .line 7
    iget-object v0, p0, Lg5/g;->r:Lg5/h;

    .line 8
    .line 9
    iput-boolean p1, v0, Lg5/h;->u:Z

    .line 10
    .line 11
    return-void
.end method
