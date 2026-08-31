.class public abstract Lh5/c;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LM/O0;


# direct methods
.method static constructor <clinit>()V
    .locals 12

    .line 1
    new-instance v0, LM/O0;

    .line 2
    .line 3
    sget-object v6, LO0/j;->s:LO0/j;

    .line 4
    .line 5
    const/16 v1, 0x10

    .line 6
    .line 7
    invoke-static {v1}, Lcom/google/android/gms/internal/measurement/n2;->y(I)J

    .line 8
    .line 9
    .line 10
    move-result-wide v4

    .line 11
    const/16 v1, 0x18

    .line 12
    .line 13
    invoke-static {v1}, Lcom/google/android/gms/internal/measurement/n2;->y(I)J

    .line 14
    .line 15
    .line 16
    move-result-wide v9

    .line 17
    const-wide/high16 v1, 0x3fe0000000000000L    # 0.5

    .line 18
    .line 19
    invoke-static {v1, v2}, Lcom/google/android/gms/internal/measurement/n2;->x(D)J

    .line 20
    .line 21
    .line 22
    move-result-wide v7

    .line 23
    new-instance v1, LL0/F;

    .line 24
    .line 25
    const-wide/16 v2, 0x0

    .line 26
    .line 27
    const v11, 0xfdff59

    .line 28
    .line 29
    .line 30
    invoke-direct/range {v1 .. v11}, LL0/F;-><init>(JJLO0/j;JJI)V

    .line 31
    .line 32
    .line 33
    const/16 v2, 0x7dff

    .line 34
    .line 35
    invoke-direct {v0, v1, v2}, LM/O0;-><init>(LL0/F;I)V

    .line 36
    .line 37
    .line 38
    sput-object v0, Lh5/c;->a:LM/O0;

    .line 39
    .line 40
    return-void
.end method
