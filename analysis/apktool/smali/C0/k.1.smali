.class public final synthetic LC0/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/ViewTreeObserver$OnScrollChangedListener;


# instance fields
.field public final synthetic a:LC0/A;


# direct methods
.method public synthetic constructor <init>(LC0/A;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LC0/k;->a:LC0/A;

    return-void
.end method


# virtual methods
.method public final onScrollChanged()V
    .locals 1

    .line 1
    iget-object v0, p0, LC0/k;->a:LC0/A;

    .line 2
    .line 3
    invoke-virtual {v0}, LC0/A;->P()V

    .line 4
    .line 5
    .line 6
    return-void
.end method
