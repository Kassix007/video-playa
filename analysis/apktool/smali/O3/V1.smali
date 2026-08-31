.class public final LO3/V1;
.super Ly3/a;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "LO3/V1;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final q:I

.field public final r:Ljava/lang/String;

.field public final s:J

.field public final t:Ljava/lang/Long;

.field public final u:Ljava/lang/String;

.field public final v:Ljava/lang/String;

.field public final w:Ljava/lang/Double;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, LA1/i;

    .line 2
    .line 3
    const/16 v1, 0x11

    .line 4
    .line 5
    invoke-direct {v0, v1}, LA1/i;-><init>(I)V

    .line 6
    .line 7
    .line 8
    sput-object v0, LO3/V1;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 9
    .line 10
    return-void
.end method

.method public constructor <init>(ILjava/lang/String;JLjava/lang/Long;Ljava/lang/Float;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput p1, p0, LO3/V1;->q:I

    iput-object p2, p0, LO3/V1;->r:Ljava/lang/String;

    iput-wide p3, p0, LO3/V1;->s:J

    iput-object p5, p0, LO3/V1;->t:Ljava/lang/Long;

    const/4 p2, 0x1

    if-ne p1, p2, :cond_1

    if-eqz p6, :cond_0

    .line 3
    invoke-virtual {p6}, Ljava/lang/Float;->doubleValue()D

    move-result-wide p1

    invoke-static {p1, p2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p9

    goto :goto_0

    :cond_0
    const/4 p9, 0x0

    :cond_1
    :goto_0
    iput-object p9, p0, LO3/V1;->w:Ljava/lang/Double;

    iput-object p7, p0, LO3/V1;->u:Ljava/lang/String;

    iput-object p8, p0, LO3/V1;->v:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(JLjava/lang/Object;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    invoke-static {p4}, Lx3/A;->d(Ljava/lang/String;)V

    const/4 v0, 0x2

    iput v0, p0, LO3/V1;->q:I

    iput-object p4, p0, LO3/V1;->r:Ljava/lang/String;

    iput-wide p1, p0, LO3/V1;->s:J

    iput-object p5, p0, LO3/V1;->v:Ljava/lang/String;

    const/4 p1, 0x0

    if-nez p3, :cond_0

    iput-object p1, p0, LO3/V1;->t:Ljava/lang/Long;

    iput-object p1, p0, LO3/V1;->w:Ljava/lang/Double;

    iput-object p1, p0, LO3/V1;->u:Ljava/lang/String;

    return-void

    .line 6
    :cond_0
    instance-of p2, p3, Ljava/lang/Long;

    if-eqz p2, :cond_1

    .line 7
    check-cast p3, Ljava/lang/Long;

    iput-object p3, p0, LO3/V1;->t:Ljava/lang/Long;

    iput-object p1, p0, LO3/V1;->w:Ljava/lang/Double;

    iput-object p1, p0, LO3/V1;->u:Ljava/lang/String;

    return-void

    .line 8
    :cond_1
    instance-of p2, p3, Ljava/lang/String;

    if-eqz p2, :cond_2

    iput-object p1, p0, LO3/V1;->t:Ljava/lang/Long;

    iput-object p1, p0, LO3/V1;->w:Ljava/lang/Double;

    .line 9
    check-cast p3, Ljava/lang/String;

    iput-object p3, p0, LO3/V1;->u:Ljava/lang/String;

    return-void

    .line 10
    :cond_2
    instance-of p2, p3, Ljava/lang/Double;

    if-eqz p2, :cond_3

    .line 11
    iput-object p1, p0, LO3/V1;->t:Ljava/lang/Long;

    .line 12
    check-cast p3, Ljava/lang/Double;

    iput-object p3, p0, LO3/V1;->w:Ljava/lang/Double;

    iput-object p1, p0, LO3/V1;->u:Ljava/lang/String;

    return-void

    .line 13
    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "User attribute given of un-supported type"

    .line 14
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public constructor <init>(LO3/W1;)V
    .locals 6

    .line 15
    iget-object v4, p1, LO3/W1;->c:Ljava/lang/String;

    iget-wide v1, p1, LO3/W1;->d:J

    iget-object v3, p1, LO3/W1;->e:Ljava/lang/Object;

    iget-object v5, p1, LO3/W1;->b:Ljava/lang/String;

    move-object v0, p0

    invoke-direct/range {v0 .. v5}, LO3/V1;-><init>(JLjava/lang/Object;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final W()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, LO3/V1;->t:Ljava/lang/Long;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    iget-object v0, p0, LO3/V1;->w:Ljava/lang/Double;

    .line 7
    .line 8
    if-eqz v0, :cond_1

    .line 9
    .line 10
    return-object v0

    .line 11
    :cond_1
    iget-object v0, p0, LO3/V1;->u:Ljava/lang/String;

    .line 12
    .line 13
    if-eqz v0, :cond_2

    .line 14
    .line 15
    return-object v0

    .line 16
    :cond_2
    const/4 v0, 0x0

    .line 17
    return-object v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, LA1/i;->b(LO3/V1;Landroid/os/Parcel;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method
