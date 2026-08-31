.class public final synthetic Lh/z;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lw1/i;


# instance fields
.field public final synthetic q:Lh/f;


# direct methods
.method public synthetic constructor <init>(Lh/f;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lh/z;->q:Lh/f;

    return-void
.end method


# virtual methods
.method public final c(Landroid/view/KeyEvent;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lh/z;->q:Lh/f;

    invoke-virtual {v0, p1}, Lh/f;->i(Landroid/view/KeyEvent;)Z

    move-result p1

    return p1
.end method
